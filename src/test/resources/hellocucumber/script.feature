Feature: Test work web app
  As user select type initial data and get result

  Scenario Outline: Positive test
    Given open app
    And User input load '<load>'
    And User input width'<width>'
    And User input length'<length>'
    And User click wood beam
    And User input height'<section_height>'
    And User input section width'<section_width>'
    When User click calculation
    Then User get utilization factor '<result>'

    Examples:
      | load | width | length | section_height | section_width | result |
      | 300  | 2     | 4      | 350            | 75            | 0.67   |

  Scenario Outline: Negative test
    Given open app
    And User input load '<load>'
    And User input width'<width>'
    And User input length'<length>'
    And User click wood beam
    And User input height'<section_height>'
    And User input section width'<section_width>'
    When User click calculation
    Then User get '<permissible_payload>'

    Examples:
      | load | width | length | section_height | section_width | permissible_payload |
      | 3    | e     | 4      | 350            | 75            | Infinity            |

  Scenario: Hello world
    Given run hello world
    Then print hello

  Scenario: Open WebApp
    Given open app

  Scenario: Open WebApp on steps
    Given open app 1 step
    And open app 2 step
    And open app 3 step
    And open app 4 step
    And open app 5 step
    And open app 6 step
