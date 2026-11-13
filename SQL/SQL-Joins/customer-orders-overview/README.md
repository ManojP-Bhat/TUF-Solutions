# [Customer Orders Overview](https://takeuforward.org/practice/sql/customer-orders-overview?category=problems-level-1-joins-deep-dive&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An e-commerce platform stores information about its customers and their purchase history.

Some customers may have registered on the platform but have not placed any orders yet.

You are given two tables:

Customers

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ customer_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- customer_id is the primary key.
- Each row represents a registered customer.

Orders

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  order_id   ║   int    ║
║─────────────┼──────────║
║ customer_id ║   int    ║
║─────────────┼──────────║
║   amount    ║   int    ║
╚═════════════╩══════════╝
```

- order_id is the primary key.
- customer_id references Customers.customer_id.

Write an SQL query to return all customers, along with their order details. If a customer has not placed any orders, display NULL for order-related columns.

The result can be returned in any order.

### Example 1:

Input:

Customers:

```
╔═════════════╦══════════╗
║ customer_id ║   name   ║
╠═════════════╬══════════╣
║      1      ║  Alice   ║
║─────────────┼──────────║
║      2      ║   Bob    ║
║─────────────┼──────────║
║      3      ║ Charlie  ║
╚═════════════╩══════════╝
```

Orders:

```
╔══════════╦═════════════╦══════════╗
║ order_id ║ customer_id ║  amount  ║
╠══════════╬═════════════╬══════════╣
║   101    ║      1      ║   500    ║
║──────────┼─────────────┼──────────║
║   102    ║      1      ║   300    ║
║──────────┼─────────────┼──────────║
║   103    ║      2      ║   200    ║
╚══════════╩═════════════╩══════════╝
```

Output:

```
╔═════════════╦══════════╦══════════╦══════════╗
║ customer_id ║   name   ║ order_id ║  amount  ║
╠═════════════╬══════════╬══════════╬══════════╣
║      1      ║  Alice   ║   101    ║   500    ║
║─────────────┼──────────┼──────────┼──────────║
║      1      ║  Alice   ║   102    ║   300    ║
║─────────────┼──────────┼──────────┼──────────║
║      2      ║   Bob    ║   103    ║   200    ║
║─────────────┼──────────┼──────────┼──────────║
║      3      ║ Charlie  ║   NULL   ║   NULL   ║
╚═════════════╩══════════╩══════════╩══════════╝
```

Explanation:

Charlie has not placed any orders, so order-related fields appear as **NULL** .

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
