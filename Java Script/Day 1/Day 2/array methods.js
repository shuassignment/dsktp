//1.  Converting Arrays to Strings

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        // document.getElementById("demo").innerHTML = fruits.toString();

            /* The toString() method returns an array as a comma separated string */

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        // document.getElementById("demo").innerHTML = fruits.join(" * ");

            /*
            The join() method joins array elements into a string.
            It this example we have used " * " as a separator between the elements:
            */            

// 2. pop() method

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        console.log(fruits);
        fruits.pop();
        console.log(fruits);
        
        /*
        The pop() method removes the last element from an array.
         */
//3.    The push() method appends a new element to an array.

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        console.log(fruits);

        fruits.push("Kiwi");
        console.log(fruits);


//4.    The shift() method removes the first array element and "shifts" all other elements to a lower index.

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        fruits.shift();            // Removes the first element "Banana" from fruits
        console.log(fruits);

//5.     The unshift() method adds a new element to an array (at the beginning), and "unshifts" older elements:

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        fruits.unshift("Lemon");    // Adds a new element "Lemon" to fruits


//6.    Array elements are accessed using their index number:

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        fruits[0] = "Kiwi";        // Changes the first element of fruits to "Kiwi"

//7.    The splice() method adds new elements to an array.

        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        console.log(fruits);
        fruits.splice(2, 0, "Lemon", "Kiwi");
        console.log(fruits);

        /*The first parameter (2) defines the position where new elements should be added (spliced in).

        The second parameter (0) defines how many elements should be removed.

        The rest of the parameters ("Lemon" , "Kiwi") define the new elements to be added.

        The splice() method returns an array with the deleted items:*/


//8.The concat() method is used to merge (concatenate) arrays

        var myGirls = ["Cecilie", "Lone"];
        var myBoys = ["Emil", "Tobias", "Linus"];
        var myChildren = myGirls.concat(myBoys);

        console.log(myChildren);

        /**
         * The concat() method does not change the existing arrays. It always returns a new array.
         * The concat() method can take any number of array arguments:
         */

        var arr1 = ["Cecilie", "Lone"];
        var arr2 = ["Emil", "Tobias", "Linus"];
        var arr3 = ["Robin", "Morgan"];
        var myChildren = arr1.concat(arr2, arr3);     // Concatenates arr1 with arr2 and arr3


//9.    The slice() method slices out a piece of an array into a new array.

        var fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
        var citrus = fruits.slice(1); //This example slices out a part of an array starting from array element 1 ("Orange"):
        /**
         * The slice() method creates a new array. It does not remove any elements from the source array.
         */

//10.   The sort() method sorts an array alphabetically:


        var fruits = ["Banana", "Orange", "Apple", "Mango","m","8","12",2];
        console.log(fruits);
        fruits.sort();
        console.log(" Sorted "+fruits);
        fruits.sort(function(){})
    
        var arr = ["2000","250","100"];
        console.log(arr.sort());
        console.log(arr.sort(function(a,b){return a-b}));
        