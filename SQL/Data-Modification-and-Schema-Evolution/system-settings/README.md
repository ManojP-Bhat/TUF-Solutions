# [System Settings](https://takeuforward.org/practice/sql/system-settings?category=problems-level-1-editing-data-and-tables&source=sql-data-engineering-foundations)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A company stores its application configuration settings in a database table named SystemSettings.

Each setting can be active or inactive.

Due to a system-wide policy change, the company has decided to deactivate all configuration settings, regardless of their current status.

Table: SystemSettings

```
╔══════════════╦══════════╗
║ Column Name  ║   Type   ║
╠══════════════╬══════════╣
║  setting_id  ║   int    ║
║──────────────┼──────────║
║ setting_name ║ varchar  ║
║──────────────┼──────────║
║  is_active   ║ tinyint  ║
╚══════════════╩══════════╝
```

- setting_id is the primary key.
- Each row represents a system configuration setting.

Existing Data

```
╔════════════╦════════════════════╦═══════════╗
║ setting_id ║    setting_name    ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║     1      ║ EmailNotifications ║     1     ║
║────────────┼────────────────────┼───────────║
║     2      ║     AutoBackup     ║     1     ║
║────────────┼────────────────────┼───────────║
║     3      ║      DarkMode      ║     0     ║
╚════════════╩════════════════════╩═══════════╝
```

Write an SQL query that updates the table so that every setting is marked as inactive.

### Example 1:

Input (Before Update)

```
╔════════════╦════════════════════╦═══════════╗
║ setting_id ║    setting_name    ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║     1      ║ EmailNotifications ║     1     ║
║────────────┼────────────────────┼───────────║
║     2      ║     AutoBackup     ║     1     ║
║────────────┼────────────────────┼───────────║
║     3      ║      DarkMode      ║     0     ║
╚════════════╩════════════════════╩═══════════╝
```

Output (After Update)

```
╔════════════╦════════════════════╦═══════════╗
║ setting_id ║    setting_name    ║ is_active ║
╠════════════╬════════════════════╬═══════════╣
║     1      ║ EmailNotifications ║     0     ║
║────────────┼────────────────────┼───────────║
║     2      ║     AutoBackup     ║     0     ║
║────────────┼────────────────────┼───────────║
║     3      ║      DarkMode      ║     0     ║
╚════════════╩════════════════════╩═══════════╝
```

Explanation

Since no WHERE clause is used, all rows are updated.

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
