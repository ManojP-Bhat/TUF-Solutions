# [Merge Recent Orders from Multiple Sources](https://takeuforward.org/practice/sql/merge-recent-orders-from-multiple-sources?category=problems-level-1-merging-query-results&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores customer orders in two different systems:

- One for online orders
- One for in-store orders

The analytics team wants to generate a unified report of recent orders.

Table: OnlineOrders

```
╔════════════╦══════════╗
║   Column   ║   Type   ║
╠════════════╬══════════╣
║  order_id  ║   int    ║
║────────────┼──────────║
║ order_date ║   date   ║
║────────────┼──────────║
║   amount   ║   int    ║
╚════════════╩══════════╝
```

- order_id is the primary key.

Table:StoreOrders

```
╔════════════╦══════════╗
║   Column   ║   Type   ║
╠════════════╬══════════╣
║  order_id  ║   int    ║
║────────────┼──────────║
║ order_date ║   date   ║
║────────────┼──────────║
║   amount   ║   int    ║
╚════════════╩══════════╝
```

- order_id is the primary key.

Write an SQL query to retrieve all unique orders from both tables where:

- order_date is on or after '2023-01-01'
- Results must be sorted by amount in descending order

Return columns in this order:

order_id | order_date | amount

### Example 1:

Input:

OnlineOrders:

```
╔══════════╦════════════╦══════════╗
║ order_id ║ order_date ║  amount  ║
╠══════════╬════════════╬══════════╣
║    1     ║ 2023-01-05 ║   500    ║
║──────────┼────────────┼──────────║
║    2     ║ 2022-12-20 ║   300    ║
║──────────┼────────────┼──────────║
║    3     ║ 2023-02-01 ║   700    ║
╚══════════╩════════════╩══════════╝
```

StoreOrders:

```
╔══════════╦════════════╦══════════╗
║ order_id ║ order_date ║  amount  ║
╠══════════╬════════════╬══════════╣
║    3     ║ 2023-02-01 ║   700    ║
║──────────┼────────────┼──────────║
║    4     ║ 2023-03-10 ║   400    ║
╚══════════╩════════════╩══════════╝
```

Output:

```
╔══════════╦════════════╦══════════╗
║ order_id ║ order_date ║  amount  ║
╠══════════╬════════════╬══════════╣
║    3     ║ 2023-02-01 ║   700    ║
║──────────┼────────────┼──────────║
║    1     ║ 2023-01-05 ║   500    ║
║──────────┼────────────┼──────────║
║    4     ║ 2023-03-10 ║   400    ║
╚══════════╩════════════╩══════════╝
```

Explanation:

- Order 2 is filtered out (before 2023).
- Order 3 appears in both tables but is shown once.
- Sorted by amount descending.

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
