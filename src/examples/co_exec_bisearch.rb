
array = (0...100).map { rand(1000) }.uniq.sort
target = array.sample
target = 100000
lo = 0
hi = array.size

# INV: answer >= lo && answer < hi
while (hi-lo) > 1
  mid = (hi + lo) / 2
  if target >= array[mid]
    lo = mid
  else
    hi = mid
  end
end

# TERM: hi-lo <= 1
# INV & TERM: answer == lo

puts "looking for #{target}, found it at #{lo} (#{array[lo]})"
