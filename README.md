# Tax Calculation - Java

This is a **Java** program that calculates the tax to be paid by taxpayers, who can be either **individuals** or **legal entities**. The program collects taxpayer data, calculates taxes according to the established rules, and displays individual amounts and the total revenue collected.

## Features
- Allows input of **N** taxpayers (defined by the user)
- Calculates tax based on the type of taxpayer:
    - **Individual:**
        - Income < R$ 20,000.00: **15% tax**
        - Income ≥ R$ 20,000.00: **25% tax**
        - Health expenses: **50% of expenses are deductible**
    - **Legal Entity:**
        - **16% tax** on annual income
        - If the company has more than **10 employees**, the rate is reduced to **14%**

## Calculation Example
**Individual:**
- Income: **R$ 50,000.00**
- Health expenses: **R$ 2,000.00**
- Calculation: `(50,000 * 25%) - (2,000 * 50%) = R$ 11,500.00`

**Legal Entity:**
- Income: **R$ 400,000.00**
- Employees: **25**
- Calculation: `400,000 * 14% = R$ 56,000.00`

## Technologies Used
- **Java**
- **Object-Oriented Programming (OOP)**
- **Inheritance and Polymorphism**

## Based on
This activity is based on the Java course example available at:
[github.com/acenelio/inheritance8-java](https://github.com/acenelio/inheritance8-java)

## How to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repository.git
   ```
2. Compile and run the program:
   ```sh
   javac Main.java
   java Main
   ```

## Author
Project developed as part of the Udemy Java course.

