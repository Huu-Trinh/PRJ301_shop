function ActiveHeart(prop) {
    prop.classList.add("active")
    console.log(prop);
}
function updateQuantity(quantity) {
    let x = quantity.value;

    if (isNaN(x)) {
        quantity.style.outline = "red";
        return;
    } else {
        const tr = quantity.parentNode.parentNode.parentNode;
        //value price each product.
        const price = tr.querySelector(".price").innerText;
        const priceValue = price.substring(1);
        //
        const total = tr.querySelector(".total");
        total.innerText = "$" + x * priceValue;
        //total of product each product when alter quantity.
        const totalValue = quantity.nextElementSibling;
        totalValue.value = x * priceValue;

        //update subtotal

        const totalAll = document.getElementsByName("total");
        let result = 0;
        const totalAllValue = totalAll.forEach((tt) => {
            result = Number(result) + Number(tt.value);
        })
        const subtotal = document.querySelector("#subtotal");
        subtotal.innerText = "$" + result;

        const ftotal = document.getElementById("ftotal");
        ftotal.innerText = Number(document.querySelector("#delivery").innerText.substring(1)) + Number(document.querySelector("#subtotal").innerText.substring(1));
        console.log(ftotal.innerText);
        ftotal.innerText = '$' + ftotal.innerText;
    }
}
const totalAll = document.getElementsByName("total");
let result = 0;
const totalAllValue = totalAll.forEach((tt) => {
    result = Number(result) + Number(tt.value);
})
const subtotal = document.querySelector("#subtotal");
subtotal.innerText = "$" + result;

const ftotal = document.getElementById("ftotal");
ftotal.innerText = Number(document.querySelector("#delivery").innerText.substring(1)) + Number(document.querySelector("#subtotal").innerText.substring(1));
console.log(ftotal.innerText);
ftotal.innerText = '$' + ftotal.innerText;
