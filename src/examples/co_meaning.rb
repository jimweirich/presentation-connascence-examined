class Phone
  CARRIERS = {
    10             => "Alltel",
    11             => "AT&T",
    12             => "Nextel",
    13             => "Sprint",
    14             => "T-Mobile",
    (WIFI=15)      => "WiFi",
    (OTHER=16)     => "Other Carrier",
    (UK=17)        => "UK Carriers",
    (CANADA=18)    => "Canadian Carriers",
  }
end


<% unless carrier == Phone::WIFI %>
  <% f.text_field :phone_number
<% end %>
