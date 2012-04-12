receipts.each do |receipt|
  submit_to_edgecase(receipt)
  file_locally(receipt)
  purge(receipt)
end
