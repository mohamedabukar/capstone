console.log(foods);
showfoods();
function showfoods(){
    for(let i=0; i<foods.length; i++){
        document.querySelector(".foods").innerHTML +=`
        <form class="food" id="food${i}" th:action="@{/addToOrder}" th:object="${foods[i]}" method="POST">
            <h3 class="foodName word">${foods[i].name}</h3>
            <p class="ingredients word">The ingredients are: ${foods[i].ingredients}</p>
            <p class="price word">Meal price: $${foods[i].price}</p>
            <button class="btn" type="submit" id="btn${i}">Add to Cart</button>
        </form>`
    }
}
// function buttons(){
//     for(let i=0; i<foods.length; i++){
//         document.querySelector("#btn+i").addEventListener("click",function(e){
//             e.preventDefault();
//
//         })
//     }
// }

