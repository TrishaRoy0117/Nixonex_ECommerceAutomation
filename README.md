# 🛒 Nixonex E-Commerce Automation Capstone Project

This project is a capstone automation framework built using Java, Selenium WebDriver, and TestNG. It automates the core workflows of the Nixonex demo e-commerce site, including registration, login, product selection, cart, and checkout.

---

## 🔹 Project Objective

To simulate real-world user journeys and validate the end-to-end functionality of the application with automation scripts using:
- Page Object Model (POM)
- ExtentReports for reporting
- Screenshot capture on failure

---

## 🧰 Tech Stack

| Tool/Technology   | Purpose                      |
|-------------------|------------------------------|
| Java              | Programming Language         |
| Selenium WebDriver| Browser automation           |
| TestNG            | Test Framework               |
| Maven             | Dependency Management        |
| ExtentReports     | HTML Reporting               |
| Git + GitHub      | Version Control              |

---

## ✅ Test Scenarios Covered

1. **User Registration**  
2. **User Login**  
3. **Product Selection - Samsung Galaxy S6**  
4. **Add to Cart**  
5. **Checkout and Order Confirmation**  
6. **Alert Handling & Form Submission**

---

## 📁 Project Structure (POM)

src/
├── base/
│ └── BaseTest.java
├── pages/
│ ├── RegisterPage.java
│ ├── LoginPage.java
│ ├── HomePage.java
│ ├── ProductPage.java
│ ├── CartPage.java
│ └── CheckoutPage.java
├── tests/
│ ├── RegisterTest.java
│ ├── LoginTest.java
│ ├── ProductTest.java
│ └── CheckoutTest.java
├── utils/
│ ├── ExtentManager.java
│ ├── ExtentTestListener.java
│ └── ScreenshotUtil.java
