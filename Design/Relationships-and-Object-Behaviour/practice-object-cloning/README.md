# [Practice (Object Cloning)](https://takeuforward.org/practice/design/practice-object-cloning?category=relationships-and-object-behaviour&source=oops)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are required to design a class hierarchy to demonstrate object cloning using shallow and deep copying in a library system. A **Library** contains a list of **Book** objects.

**Shallow** Copy: Creates a new object that shares references with the original object for nested structures.

**Deep** Copy: Creates a completely independent copy of the original object, including all nested structures.

Classes :

**Book** :

- **Attributes** : *title* (string) , *author* (string)

**Library** :

- **Attributes** : *name* (string) , *books* (List of Book class)
- **Methods** :
- *shallowClone* () : Creates a shallow copy of the Library object.
- *deepClone* () : Creates a deep copy of Library object.
- display() : Displays the output/ attributes of the class.
- addBook (Book book) : It adds one book info to the list of books.

Refer the commented code on IDE to understand the output format using display method.

Refer the sample example output to understand the output format.

### Example 1:

**Input:** name = "Central_Library"

title = [ "Frankestein", "King_Arthur_and_the_Round_Table" ]

author = [ "Mary_Shelley", "Rosemary_Sutcliff" ]

changeIndex = 1

newTitle = "Treasure_Island"

new_author = "Robert_Louis_Stevenson"

**Output:**

Original Library :

Library : Central_Library

Book : Frankestein, Author : Mary_Shelley

Book : King_Arthur_and_the_Round_Table, Author : Rosemary_Sutcliff

After Modifications :

Original Library :

Library : Central_Library

Book : Frankestein, Author : Mary_Shelley

Book : Treasure_Island, Author : Robert_Louis_Stevenson

Shallow Clone :

Library : Central_Library

Book : Frankestein, Author : Mary_Shelley

Book : Treasure_Island, Author : Robert_Louis_Stevenson

Deep Clone :

Library : Central_Library

Book : Frankestein, Author : Mary_Shelley

Book : King_Arthur_and_the_Round_Table, Author : Rosemary_Sutcliff

**Explanation:**

- First we will create a Library class object named 'library' with name being passed through constructor for initialization.
- Then we will iterate over the title and author array to add them in the list of books present in the Library class.
- Now a text is printed through driver code. And following it we call the display function of Library class to print the attributes of the library object that we set.
- Next we will create the shallow clone object by calling the method shallowClone().
- Next we will create the deep clone object by calling the method deepClone().
- Now we will change the title and author of the index 'changeIndex' to newTitle and newAuthor for the original library object. (This will be done through driver code, you do not have to write this part).
- Now we will print some text and call the display method through the original library object and print the attributes of Library class.
- Next we will call the display method through shallow clone object and print the attributes of Library class.
- Next we will call the display method through deep clone object and print the attributes of Library class.

As per output you can see, that the title and author for book at index = 1, have been changed in original library object and shallow clone object. But whereas the Deep clone object still has the old information.

This is what you should be able to achieve through your code.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= title.size() , author.size() <= 10^4
- title.size() == author.size()
- 0 <= changeIndex < title.size()

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
