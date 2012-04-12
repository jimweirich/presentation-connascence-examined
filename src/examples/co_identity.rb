class Page < ActiveRecord::Base
  belongs_to :wiki

  # ...

  def make_home_page
    wiki.home = title
    wiki.save
  end
end

describe "make home page" do
  Given(:wiki) { Wiki.create(name: "Wiki", home: "TheOldHomePage") }
  Given(:page) { wiki.pages.create(title: "TheNewHomePage") }

  When { page.make_home_page }

  Then { wiki.home.should == "TheNewHomePage" }
end

describe "check identity" do
  Given(:wiki) { Wiki.create(name: "Wiki", home: "TheOldHomePage") }
  Given(:page) { wiki.pages.create(title: "TheNewHomePage") }

  Then { wiki.should == page.wiki }      # PASSES
  Then { wiki.should be(page.wiki) }     # FAILS
end
