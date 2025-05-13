let cart = [];
let totalCost = 0;

function addToCart(itemName, cost, size) {
    if (!size) {
        alert("Please select a size before adding to the cart!");
        return;
    }
    
    cart.push({ name: itemName, price: cost, size: size });
    totalCost += cost;
    
    document.getElementById("cart-count").innerText = cart.length;
    document.getElementById("cart-total").innerText = $${totalCost};
    
    updateCartDisplay();
    alert(${itemName} (${size}) added to cart! Total Cost: $${totalCost});
}

function updateCartDisplay() {
    let cartList = document.getElementById("cart-items");
    cartList.innerHTML = "";
    
    cart.forEach((item, index) => {
        let listItem = document.createElement("li");
        listItem.innerHTML = `${item.name} (Size: ${item.size}) - $${item.price} 
            <button onclick="removeFromCart(${index})">Remove</button>`;
        cartList.appendChild(listItem);
    });
}

function removeFromCart(index) {
    totalCost -= cart[index].price;
    cart.splice(index, 1);
    
    document.getElementById("cart-count").innerText = cart.length;
    document.getElementById("cart-total").innerText = $${totalCost};
    
    updateCartDisplay();
}

function checkout() {
    if (cart.length === 0) {
        alert("Your cart is empty!");
    } else {
        alert(Proceeding to checkout. Total cost: $${totalCost});
        cart = [];
        totalCost = 0;
        document.getElementById("cart-count").innerText = 0;
        document.getElementById("cart-total").innerText = "$0";
updateCartDisplay();
    }
}

function clearCart() {
    cart = [];
    totalCost = 0;
    document.getElementById("cart-count").innerText = 0;
    document.getElementById("cart-total").innerText = "$0";
    updateCartDisplay();
}
