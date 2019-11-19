# cs212-Assignment2
For this assignment, we want to implement the basic java classes to support the concept of an Online Store and a shopping cart.
Consider an e-store with various types of items: books, flowers, gift cards, etc... and we like to be able to support the ability to handle a shopping cart that can contain various types of items.

For this assignment you are asked to create the following classes: 

abstract class: “Item”
every item has a unique item_id (a positive integer, auto-incremented for each new item), a price (double, 0 or positive), and quantity (integer, 0 or positive), Title (String, cannot be empty).Every item can be “Display()”, an abstract method, and “Purchase()” (that is removed from the inventory).
 
concrete class: “Book”
a Book is-an item. It adds the attributes “author”, “title” and “year”.
 
concrete class: “GiftCard”
a GiftCard is-an item. It adds the attributes “label”, and “manufacturer”.

concrete class: “Shoe”
a Shoe is-an item. It adds the attributes “colour” (a String one of these colours: white, silver, red, beige, brown, blue, black, pink), and “size” (double).

Write an application that maintains a list of items entered from the user by means of an interactive menu.

The user can:

Add item to the inventory, entering its type (book or gift card, etc), and necessary attributes along with quantity.

Display all items.

Display only books sorted by author name.

Display only gifts sorted by label.

Display only shoes sorted by sizeDelete an item by item_id

Purchase an item by removing the purchased quantity from the inventory

Bonus: Instead of array object use a linked list to enable dynamic size for the e-store.
