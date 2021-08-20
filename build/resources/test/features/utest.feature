# Autor: Daniel Andres Cerquera Lasso

@stories
Feature: Utest Register
  As a user, automation of user registration will be generated
  @scenario1
  Scenario: Register in the platform utest
    Given Than Daniel want to register in to platform Utest
    When He enters the information requested in the Utest registration form
      | strFristName    | strLastName   | strEmail                      | strIdiom    | strBrand    | strModel      | strOsVersion   | strPassword          |   strCity       |  strZip     | strCountry    |
      | Daniel          | Lasso         | danielLasso@gmail.com         | spanish     | Apple       | iPhone 8 Plus | iOS 14.5.1     | /DLasso/2021**2021   |   Bogotá        |  00000      | Colombia      |
    Then Go back to the Utest home page select the login option and enter the access credentials the access credentials validate The last step