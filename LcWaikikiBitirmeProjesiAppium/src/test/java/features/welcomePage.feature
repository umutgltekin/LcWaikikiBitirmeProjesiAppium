

Feature: LcWaikiki

  Scenario Outline:end-to-end payment step
    Given user navigates to LC Waikiki
    When click skip button
    When click Login button
    Then should see login page
    When enter Email "<Email>"
    When enter password "<Password>"
    When click Login page login button
    Then should see home page
    When click Katagoriler button
    When clikc Giyim button
    When click Product Bluz
    Then should see products page
    When click filter button
    When click colour "Siyah"
    When click name LCW GRACE Bağlamalı Yaka Kadın Bluz
    Then should see product detail page
    When click product size L
    When click add cart
    When click cart button
    Then check cart page
    Then check product size "L"
    Then check product name "LCW GRACE Bağlamalı Yaka Nakışlı Uzun Kollu Kadın Bluz"
    Then check product number of 1.
    When click go payment page button
    Then check payment page
    Examples:
      |Email              |Password|
      |gltkn116@gmail.com|Gltkn.23|




