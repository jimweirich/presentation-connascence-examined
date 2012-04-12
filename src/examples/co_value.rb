class Triangle
  attr_reader :a, :b, :c

  def initialize(a, b, c)
    @a, @b, @c = a, b, c
  end

  def valid?
    x, y, z = [a, b, c].sort
    x + y > z
  end
end

require 'rspec'
require 'rspec/given'

describe Triangle do
  Given(:triangle) { Triangle.new(*sides) }

  context "when the sides are good" do
    Given(:sides) { [3, 4, 5] }
    Then { triangle.should be_valid }
  end

  context "when the sides are bad" do
    Given(:sides) { [3, 1, 5] }
    Then { triangle.should_not be_valid }
  end

  context "when the sides almost good" do
    Given(:sides) { [3, 2, 5] }
    Then { triangle.should_not be_valid }
  end
end
