Feature: Product Catalog
  As a customer,
  I want to easily search, filter, and sort products in the catalog
  So that I can find what I need quickly

  Rule: Customers should be able to search for products by name
    Example: The on where Sally searches for an Adjustable Wrench
      Given Sally is  on the home page
      When she searches for "Adjustable Wrench"
      Then the "Adjustable Wrench" product should be displayed
