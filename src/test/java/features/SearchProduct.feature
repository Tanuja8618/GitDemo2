
Feature: Search and place the order for product
  
  Scenario: Search experience for product search in both home and offerPage
  Given User is on greencart landing page
  When User search with shortname "Tom"
  And Extract actual name of product
  Then User search for "Tom" shortnmae in offerpage
  And Validate product name in offerpage matches with landing page
