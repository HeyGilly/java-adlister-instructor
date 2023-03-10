<%--
  Created by IntelliJ IDEA.
  User: gilly
  Date: 3/9/23
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Pizza Order</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>


<%--Form That will take in pizza order--%>
<form method="post" action="pizza-order" class="border" style="width:620px">

  <form method="post" action="/pizza-order" class="border" style="width:620px">
        <%-- Crust Type (Select Input) --%>
            <label for="crustType" class="form-label">Crust Type:</label>
            <select class="form-select" aria-label="Default select" name="crust-type" id="crustType">
                <option disabled selected>Choose...</option>
                <option value="thin">Thin</option>
                <option value="flatbread">Flatbread</option>
                <option value="deep dish">Deep-dish</option>
                <option value="chicago">Chicago Deep Dish</option>
                <option value="thick">Thick</option>
                <option value="stuffed">Stuffed</option>
            </select>
        <%--Sauce (Select Input)--%>
            <label for="sauceType" class="form-label">Sauce Type:</label>
            <select class="form-select" aria-label="Default select" name="sauce-type" id="sauceType">
                <option selected disabled>Choose...</option>
                <option value="marinara">Marinara Sauce</option>
                <option value="vodka">Vodka Sauce</option>
                <option value="alfredo">Alfredo Sauce</option>
                <option value="pesto">Pesto Sauce</option>
                <option value="buffalo">Buffalo Sauce</option>
                <option value="barbeque">Barbeque Sauce</option>
            </select>
        <%--Size (Select Input--%>
            <label for="size" class="form-label">Size:</label>
            <select class="form-select" aria-label="Default select" name="size" id="size">
                <option selected disabled>Choose...</option>
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
                <option value="x-large">Extra-Large</option>
            </select>
        <%-- Toppings (Checkboxes) --%>
            <span>Topping:</span>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="pepperoni" id="pepperoni" name="topping">
                <label class="form-check-label" for="pepperoni">
                    Pepperoni
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="mushroom" id="mushroom" name="topping">
                <label class="form-check-label" for="mushroom">
                    Mushroom
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="sausage" id="sausage" name="topping">
                <label class="form-check-label" for="sausage">
                    Sausage
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="onion" id="onion" name="topping">
                <label class="form-check-label" for="onion">
                    Onion
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="black-olives" id="blackOlives" name="topping">
                <label class="form-check-label" for="blackOlives">
                    Black Olives
                </label>
            </div>
            <hr class="w-75 mx-auto border border-3 border-dark" />
    Delivery address


  <%--Delivery address--%>
  <div class="row g-3">
    <%--Address--%>
    <div class="col-12">
      <label for="address1" class="form-label">Address</label>
      <input type="text" class="form-control" id="address1" name="address1" placeholder="1234 Main St">
    </div>
    <%--Address 2--%>
    <div class="col-12">
      <label for="address2" class="form-label">Address 2</label>
      <input type="text" class="form-control" name="address2" id="address2" placeholder="Apartment, studio, or floor">
    </div>
    <%--City--%>
    <div class="col-md-6">
      <label for="city" class="form-label">City</label>
      <input type="text" class="form-control" id="city" name="city">
    </div>
    <%--State--%>
    <div class="col-md-4">
      <label for="state" class="form-label">State</label>
      <input type="text" class="form-control" id="state" name="state">
    </div>
    <%--Zip--%>
    <div class="col-md-2">
      <label for="zip" class="form-label">Zip</label>
      <input type="text" class="form-control" id="zip" name="zip">
    </div>
    <%--Submit Button--%>
    <div class="col-12">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
</form>





</body>
</html>
