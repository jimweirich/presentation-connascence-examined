
class Account
  attr_reader :balance

  def initialize
    @balance = 0
  end

  def deposit(amount)
    @balance += amount
  end
end


THREADS = 10

account = Account.new

threads = (0...THREADS).map { |i|
  Thread.new {
    1000.times { account.deposit(1); sleep(0.001) }
  }
}
threads.each { |t| t.join }

puts account.balance

