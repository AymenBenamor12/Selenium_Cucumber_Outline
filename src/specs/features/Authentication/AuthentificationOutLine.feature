Feature: Authentification - demoqa
  ETQ utilisateur je souhaite m'authentifier

  @cnx
  Scenario Outline: Title of your outline
    Given je me connecte sur l'application demoqa
    When je saisie le firstnom d'utilisateur "<firstName>"
    And je saisie le lastname de l'utilisateur "<lastName>"
    And je saisie le email de l'utilisateur "<email>"
    And je clique sur le genderMale
    And je saisie le mobile de l'utilisateur "<mobile>"
    And je saisie le address de l'utilisateur "<address>"
    And je clique sur submitBtn
    And je prend un sreenshot "<screenShot>"
    And je clique sur closebtn
    Then je me redirige vers la plage home

    Examples: 
      | firstName    | lastName          |email                      |mobile     |address         | screenShot|
      |CustomerName1 |  CustomerlastName1| CustomerEmail1@techndeck.com|1111111111 | currentAddress1| screenShot1|        
      |CustomerNme2  | CustomerlastName2 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot2|
      |CustomerNae3  | CustomerlastName3 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot3|
      |CustomerNam4  | CustomerlastName4 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot4|
      |CustomrName10 | CustomerlastName10|CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot5|
      |CustomerName11|CustomerlastName11 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot6|
      |Customerame12 |CustomerlastName12 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot7|
      |Customerame13 |CustomerlastName13 |CustomerEmail1@techndeck.com |1111111111 |currentAddress1 |screenShot8|
      
