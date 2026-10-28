# [Practice (Interfaces)](https://takeuforward.org/practice/design/practice-interfaces?category=advance-oops-features&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are required to design an interface **PaymentGateway** that defines a common method for processing payments. Implement two classes, **CreditCardPayment** and **UPIPayment** , which provide specific implementations of the *processPayment* () method. Use polymorphism to demonstrate how different payment methods can be processed through the same interface.

Interface **PaymentGateway :**

- Abstract Method *processPayment( double amount ) :* This method processes a payment of the specifies amount.

Implementing classes :

**CreditCardPayment** :

Method :

- *processPayment( double amount )* : Implements to print "Processing credit card payment of amount".

**UPIPayment**

Method :

- *processPayment( double amount )* : Implements to print "Processing UPI payment of amount".

Refer the sample input example to understand about the output format.

Refer the commented code on IDE for output statements.

### Example 1:

**Input:** paymetMethod = [ "credit", "upi" ]

paymentValue = [ 284.5 , 27476.2 ]

**Output:**

Processing credit card payment of 284.50

Processing UPI payment of 27476.20

**Explanation:**

- We iterate over the paymeentMethod list.
- If the payment is through the credit card :
- We create the object of class **CreditCardPayment** .
- Then call the *processPayment* () method with the amount to print the corresponding output text.
- If the payment is through the UPI :
- We create the object of class **UPIPayment** .
- Then call the *processPayment* () method with the amount to print the corresponding output text.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
