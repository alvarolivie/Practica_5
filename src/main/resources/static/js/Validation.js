const SendData= async () => {
    let email = $("#inputEmail").val();
    let name =$("#inputName").val();
    let sur = $("#inputSur").val();
    let city = $("#inputCity").val().toUpperCase();
    let date = $("#inputDob").val();
    fetch("Practica5/add", {
                       method: "POST",
                       headers: new Headers({
                           "content-Type" : "application/json"
                           }
                       ),
                       body: {
                           "email": email,
                           "name" : name,
                           "surname" : sur,
                           "city" : city,
                           "date" : date
                       }
                    });

}