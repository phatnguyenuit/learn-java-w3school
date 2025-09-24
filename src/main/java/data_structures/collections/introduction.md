# Collections

| Interface | Common Classes	                       | Description                               |
|:----------|:--------------------------------------|:------------------------------------------|
| `List`    | `ArrayList`, `LinkedList`             | Ordered collection that allows duplicates |
| `HashSet` | `HashSet`, `TreeSet`, `LinkedHashSet` | Collection of unique elements             |
| `HashMap` | `HashMap`, `TreeMap`, `LinkedHashMap` | Stores key-value pairs with unique keys   |

## Details

1. `List`
   - `ArrayList`: Resizable array that maintains order and allows duplicates
   - `LinkedList`: List with fast insert and remove operations
2. `HashSet`
    - `HashSet`: Unordered collection of unique elements
    - `TreeSet`: Sorted set of unique elements (natural order)
    - `LinkedHashSet`: Maintains the order in which elements were inserted
3. `HashMap`
    - `HashMap`: Stores key/value pairs with no specific order
     - `TreeMap`: Sorted map based on the natural order of keys
    - `LinkedHashMap`: Maintains the order in which keys were inserted