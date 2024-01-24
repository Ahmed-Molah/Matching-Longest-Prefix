
# Matching Longest Prefix - Java

I used a ternary search tree(TST), which is a special trie data structure where the child nodes of a standard trie are ordered as a binary search tree.

One of the advantage of using ternary search trees over binary serach trees or tries is that TST is more efficient in terms of speed and space.


## Characteristics of TST

TST is a type of tree-based data structure that is used for searching and retrieval of key-value pairs where the keys are strings.
- Each node in TST has three children, a left child, a middle child and a right child.
- It is a powerful dictionary finding tool, meaning that they can also be used for exact string matching.
- Ternary search trees are ordered, meaning that they maintain a specific order among the stored values.

### Requirements
This project require the following:

- Java 11 and higher (tested with Java 18).
- Maven 4.0. 

- Operating system: no specific requirements (tested on Linux - PopOS).

#### Reference
- https://www.baeldung.com/cs/ternary-search-tree
- https://www.geeksforgeeks.org/ternary-search-tree-meaning-definition-in-dsa/
