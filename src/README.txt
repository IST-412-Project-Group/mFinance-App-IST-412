READ ME: M04-A03 Two Implemented Use Cases with Clean, Refactored Code

Refactoring implementations:

Data type utilization:
    Interest rate change type(src>Loan>apply)
        -Changed double to long
    UUID library (src>Loan>apply)
        -Implement unique ID’s for loans
    Amount data type(src>Loan>Loan)
        -change type from int to accommodate decimals
Readability
    Comments(Every class)
        -added comments throughout to help readability
    readme(here)
        -added readme for more understandable changes
    Meaningful variables names(src>mfinance_usecase>LoanUI)
        -needed descriptive variables names to improve readability
    Redundant formating(src>mfinance_usecase>LoanUI & src>mfinance_usecase>MainMenu)
        -variables were declared on top and bottom. Changed for consistency. 
