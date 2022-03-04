const SendData= async () => {
        fetch("Practica5/add", {
                           method: "POST",
                           headers: {
                               "content-Type": "application/json",
                               "Accept" : "application/json"
                           },
                           body: JSON.stringify({
                               email: $("#inputEmail").val(),
                               name : $("#inputName").val(),
                               surname : $("#inputSur").val(),
                               city : $("#inputCity").val().toUpperCase(),
                               dob : $("#inputDob").val()
                           })
        }).then(res => {
            if(res.ok) {
                alert("Todo correcto");
            }
            else {
                return res.text().then(text => { throw new Error(text) })
            }
        })
            .catch(error => {
                alert("Por favor compruebe los datos");
            });
}