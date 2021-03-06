
## Cart tests
----

### Cart_addProduct:


<details>
<summary><strong>adding a product to the cart from quick pop-up page</strong></summary>
<p>
   
- open deals page
- open one of the deals products
- make sure there is no 400 error
- save its name
- choose variations if exist and add to the cart
- if we managed to add the product, its title is found in the cart
</p>
</details> 
      
<details>
<summary><strong>adding a product to the cart from second product pop-up page</strong></summary> 
<p>
    
- open deals page
- open one of the deals products  
- make sure there is no 400 error
- move to the next product  
- make sure there is no 400 error
- save its name
- choose variations if exist and add to the cart
- if we managed to add the product, its title is found in the cart
</p>
</details> 
              
<details>
<summary><strong>adding a product to the cart from less-than-5 tab</strong></summary>
<p>
   
- open the less-than-5 tab
- click the third thumbnail
- make sure there is no 400 error
- save its title	
- choose variations if exist and add to the cart
- if we managed to add the product, its title is found in the cart
</p>
</details> 
      		
<details>
<summary><strong>adding a product to the cart from category</strong></summary>
<p>
   
- open main page
- chose the first category from side panel and choose the first sub category
- click the third thumbnail  
- make sure there is no 400 error
- save its title	
- choose variations if exist and add to the cart
- if we managed to add the product, its title is found in the cart
</p>
</details> 
      
<details>
<summary><strong>adding a product to the cart from product page</strong></summary>
<p>
   
- get to the required product page 
- make sure there is no 400 error
- save its name
- add to the cart
- if we managed to add the product, its title is found in the cart
</p>
</details> 
     
<details>
<summary><strong>adding both a product from aliExpress and a product from Amazon to the cart</strong></summary>
 <p>
  
- get to the aliExpress product page 
- make sure there is no 400 error
- save its name
- add to the cart
- get to the amazon product page
- make sure there is no 400 error
- save its title
- add to the cart
- if we managed to add the products, both titles are in the cart
- at the end, remove the product from the cart, for the future tests
</p>
</details> 
    
 
----


### Cart_addProduct_withLoggedUser:

<details>
<summary><strong>adding a product while unlogged, and the logging in and checking for the product in the cart</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- save its name
- add to the cart
- back to main page and connect to the user
- if we managed to add the product, its title is found in the cart
- empty the cart and disconnect from the user for the next tests
 </p>
</details> 
     
<details>
<summary><strong>adding a product then disconnecting and logging in back, and checking for the product in the cart</strong></summary>
<p>
   
- connect to the user
- get to the required product page
- make sure there is no 400 error
- save its name
- add to the cart 
- disconnect from the user and then connect back 
- if we managed to add the product, its title is found in the cart
- empty the cart and unlogging at the end for the next tests
</p>
</details> 
    
   
----


### Cart_addProduct_withVariations:</strong></summary>

<details>
<summary><strong>adding a product to the cart - with one variation</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- save its name
- choose the product variation - first option from the droplist - and save variation name
- add to the cart
- if we managed to add the product correctly, its title and its chosen variation are found in the cart
 </p>
</details> 
     
<details>
<summary><strong>adding a product to the cart - with two variations</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- save its name
- choose the first variation - first option from the first droplist - and save its name
- choose the second variation - first option from the second droplist - and save its name
- add to the cart
- if we managed to add the product correctly, its title and its chosen variations are found in the cart
</p>
</details> 
      
<details>
<summary><strong>adding a same product twice to the cart, each time with one different variation</strong></summary>
<p>
    
- get to the required product page
- make sure there is no 400 error
- save its name
- choose the product variation - first option from the droplist - and save elements name
- add to the cart
- choose another product variation - second option from the droplist - and save its name
- add to the cart again
- if we managed to add the product correctly, its title and its chosen variations are found in the cart
- at the end, remove the product from the cart, for the future tests
</p>
</details> 
      
<details>
<summary><strong>adding a same product twice to the cart, each time with two different variation (while the first is the same in both cases)</strong></summary>
<p>
    
- get to the required product page
- make sure there is no 400 error
- save its name
- choose the first variation - first option from the first droplist - and save its name
- choose the second variation - first option from the second droplist - and save its name
- add to the cart
		-choose the second variation again - second option from the second droplist - and save its name
- add to the cart again
- if we managed to add the product correctly, its title and its chosen variations are found in the cart
- at the end, remove the product from the cart, for the future tests
 </p>
</details> 
    		         
<details>
<summary><strong>adding twice the same product to the cart, using plus-one button</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- add to the cart and then add another one to the cart with the plus-one button
- if we managed to add the product twice, its quantity in the cart is 2:
</p>
</details> 
      
<details>
<summary><strong>adding twice the same product to the cart, using quantity button</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- increase the quantity to 2 and then add to the cart 
- if we managed to add the product twice, its quantity in the cart is 2
</p>
</details> 
      
<details>
<summary><strong>adding twice the same product to the cart, using quantity and then plus-one buttons</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- add to the cart and then increase the quantity to another 2 and add to the cart again 
- if we managed to add the product and then add it twice again, its quantity in the cart is 3
</p>
</details> 
      
<details>
<summary><strong>adding twice the same product to the cart, by changing quantity manually in the cart</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- add to the cart 
- change the quantity in the cart manually to 3
- if we managed to add the product twice, its quantity in the cart is 2
</p>
</details> 
   

----
 
     
### Cart_mobile:

<details>
<summary><strong>checking the final sum in the cart affected by changing the quantity in the cart</strong></summary>
<p>
   
- change to mobile screen resolution
- get to the required product page
- make sure there is no 400 error
- save its price
- increase the quantity to 2 and then add to the cart 
- reopen the cart and change the quantity manually to "1"
- the final sum supposed to be of 1 unit only 
- remove the product at the end, for the future tests
</p>
</details> 
      
<details>
<summary><strong>adding product to the cart and changing quantity manually in the cart, for more then 10 items</strong></summary> 
<p>
   
- change to mobile screen resolution
- add required product to the cart
- reopen the cart and change the quantity manually to "11"
- reopen the cart and check for the current quantity
- if succeed, the final quantity supposed to be 11 units 
- remove the product at the end, for the future tests
</p>
</details> 
             
<details>
<summary><strong>removing product from from the cart</strong></summary>
<p>
   
- change to mobile screen resolution
- add required product to the cart
- remove the product and reopen the cart
- if we managed to remove the product from the cart, it contains a message of empty cart
</p>
</details> 
      
<details>
<summary><strong>removing product from the cart to favorites</strong></summary>
<p>
   
- change to mobile screen resolution
- add required product to the cart and save its title
- remove the product to favorites and reopen the cart
- open the favorites window and save its contents
- if we managed to remove the product, the cart won't contain its title, but the favorites will contain it			
- at the end, remove the products from the favorites, for the future tests		
 </p>
</details> 
    
   
----


### Cart_price:

<details>
<summary><strong>checking the final sum in the cart includes the delivery</strong></summary>
<p>
   
- get to the required product page  
- make sure there is no 400 error
- save the sum of its price and delivery price/
- add to the cart
- if the prices added correctly, the final price will be the sum of original price plus delivery 
</p>
</details> 
      
<details>
<summary><strong>checking the final sum in the cart includes the discount</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- choose the product variation - first option from the droplist
- add to the cart and save the price after discount
- if the prices added correctly, the price after the discount will be the final sum	
 </p>
</details> 
     
<details>
<summary><strong>checking the final sum in the cart includes all products in the cart</strong></summary>
 <p>
  
- get to the first product page
- make sure there is no 400 error
- save its price
- add to the cart 
- get to the second product page and save its price
- add to the cart
- the sum of both products
- if the prices added correctly, the final price will be the sum of two products	
- at the end, remove the products from the cart, for the future tests		
 </p>
</details> 
     
<details>
<summary><strong>checking the final sum in the cart affected by the quantity of the product</strong></summary>
<p>
   
- get to the product page
- make sure there is no 400 error
- increase the quantity to 2 and save the price
- save the sum of two units
- add to the cart 
- if the prices added correctly, the final price will be the sum of two units
</p>
</details> 
      		   
<details>
<summary><strong>checking the final sum in the cart includes all different variations of the same product</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- choose the product variation - first option from the droplist and save its price
- add to the cart 
- choose another product variation - second option from the droplist - and save its name
- save the sum of two variations
- add to the cart 
- if the prices added correctly, the final sum	includes the prices of all variations
- at the end, remove the products from the cart, for the future tests		
</p>
</details> 
      
<details>
<summary><strong>checking the final sum in the cart affected by removing one of the products</strong></summary>
<p>
   
- get to the first product page 
- make sure there is no 400 error
- save its price			
- add to the cart 
- get to the second product page 
- make sure there is no 400 error
- save its price	
- add to the cart
- reopen the cart and remove the first item from the cart		
- if the prices added correctly, the final price will be of the second product only	
- at the end, remove the products from the cart, for the future tests		
</p>
</details> 
      
<details>
<summary><strong>checking the final sum in the cart affected by changing the quantity in the cart</strong></summary>
<p>
   
- get to the required product page 
- make sure there is no 400 error
- save its price
- increase the quantity to 2 and then add to the cart 
- reopen the cart and change the quantity manually to "1"
- the final sum supposed to be of 1 unit only
</p>
</details> 
      
   
----
  
            
### Cart_removeProduct:

<details>
<summary><strong>removing product from the cart</strong></summary>
<p>
   
- get to the required product page  
- make sure there is no 400 error
- save its title
- add to the cart
- empty the cart
- if we managed to remove the product from the cart, it contains a message of empty cart
</p>
</details> 
      
<details>
<summary><strong>removing product from the cart to the favorites</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- save its title
- add to the cart
- back to main page and open the cart			
- remove the item and choose adding it to favorites
- check if the cart contains the removed item  
- open the favorites window and save its contents
- if we managed to remove the product, the cart won't contain its title, but the favorites will contain it:			
- at the end, remove the products from the favorites, for the future tests		
</p>
</details> 
      
<details>
<summary><strong>removing product from the cart and then returning it back</strong></summary>
<p>
   
- get to the required product page
- make sure there is no 400 error
- save its title
- add to the cart
- back to main page and open the cart			
- remove the item and choose returning it to the cart
- if we managed to return the product, its title is found in the cart:
</p>
</details> 
      
<details>
<summary><strong>adding same product twice with different variations, and then removing one of them from the cart</strong></summary>
<p>
   
- get to the required product page 
- make sure there is no 400 error
- save its title
- choose the product variation - first option from the droplist - and save its name
- add to the cart
- choose another product variation - second option from the droplist - and save its name
- add to the cart again
- back to main page and open the cart			
- remove the first item from the cart
- reopen the cart			
- if we removed the first variation only, then the cart includes the title of product and its second variation only 
   
<details>
<summary><strong>removing product from the payment page</strong></summary>
<p>
   
- get to the required product page 
- make sure there is no 400 error
- save its title
- add to the cart and proceed to the payment
- remove the product
- reopen the cart	
- if we managed to remove the product from the cart, it contains a message of empty cart
</p>
</details> 
      
<details>
<summary><strong>removing product to favorites from the payment page</strong></summary>
<p>
 
- get to the required product page
- make sure there is no 400 error
- save its title
- add to the cart and proceed to the payment
- remove the product
- reopen the cart	
- check if the cart contains the removed item
- open the favorites window and save its contents
- if we managed to remove the product, the cart won't contain its title, but the favorites will contain it:		
- at the end, remove the products from the favorites, for the future tests		
</p>
</details> 
   






