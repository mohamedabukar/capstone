console.log(foods);
showOrders();
//Function to show all order data on the cart page
function showOrders(){
        for(let i = 0; i< foods.length; i++) {
                document.querySelector(".foods").innerHTML += `
        <form class="food" id="food${i}">
            <h3 class="foodName word">${foods[i].foodName}</h3>
            <p class="ingredients word">The ingredients are: ${foods[i].ingredients}</p>
            <p class="price word">Meal price: $${foods[i].price}</p>
        </form>`
        }
}


