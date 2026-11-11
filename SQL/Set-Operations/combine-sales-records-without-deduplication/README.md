# [Combine Sales Records Without Deduplication](https://takeuforward.org/practice/sql/combine-sales-records-without-deduplication?category=problems-level-1-merging-query-results&source=sql-data-engineering-foundations)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company stores its sales data separately for:

- Domestic transactions
- International transactions

For auditing purposes, the finance team needs a complete list of all sales records, even if some entries appear in both systems.

Table: DomesticSales

```
╔═══════════╦══════════╗
║  Column   ║   Type   ║
╠═══════════╬══════════╣
║  sale_id  ║   int    ║
║───────────┼──────────║
║ sale_date ║   date   ║
║───────────┼──────────║
║  amount   ║   int    ║
╚═══════════╩══════════╝
```

- sale_id is the primary key.

Table: InternationalSales

```
╔═══════════╦══════════╗
║  Column   ║   Type   ║
╠═══════════╬══════════╣
║  sale_id  ║   int    ║
║───────────┼──────────║
║ sale_date ║   date   ║
║───────────┼──────────║
║  amount   ║   int    ║
╚═══════════╩══════════╝
```

- sale_id is the primary key.

Write an SQL query to return all sales records from both tables, including duplicates if any exist.

Return columns in this order:

sale_id | sale_date | amount

Return the result ordered by sale_id, then sale_date, and then amount, all in ascending order..

### Example 1:

Input:

DomesticSales:

```
╔══════════╦════════════╦══════════╗
║ sale_id  ║ sale_date  ║  amount  ║
╠══════════╬════════════╬══════════╣
║    1     ║ 2023-01-05 ║   500    ║
║──────────┼────────────┼──────────║
║    2     ║ 2023-01-06 ║   300    ║
╚══════════╩════════════╩══════════╝
```

InternationalSales:

```
╔══════════╦════════════╦══════════╗
║ sale_id  ║ sale_date  ║  amount  ║
╠══════════╬════════════╬══════════╣
║    2     ║ 2023-01-06 ║   300    ║
║──────────┼────────────┼──────────║
║    3     ║ 2023-01-07 ║   700    ║
╚══════════╩════════════╩══════════╝
```

Output:

```
╔══════════╦════════════╦══════════╗
║ sale_id  ║ sale_date  ║  amount  ║
╠══════════╬════════════╬══════════╣
║    1     ║ 2023-01-05 ║   500    ║
║──────────┼────────────┼──────────║
║    2     ║ 2023-01-06 ║   300    ║
║──────────┼────────────┼──────────║
║    2     ║ 2023-01-06 ║   300    ║
║──────────┼────────────┼──────────║
║    3     ║ 2023-01-07 ║   700    ║
╚══════════╩════════════╩══════════╝
```

Explanation:

Sale 2 appears in both tables and is shown twice because duplicates are allowed.

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
