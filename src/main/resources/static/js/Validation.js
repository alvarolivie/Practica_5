const SendData= async () => {
        let iemail = $("#inputEmail").val();
        let iname =$("#inputName").val();
        let isur = $("#inputSur").val();
        let icity = $("#inputCity").val().toUpperCase();
        let idate = $("#inputDob").val();

        fetch("Practica5/add", {
                           method: "POST",
                           headers: {
                               "content-Type": "application/json",
                               "Accept" : "application/json"
                           },
                           body: JSON.stringify({
                               email: iemail,
                               name : iname,
                               surname : isur,
                               city : icity,
                               dob : idate
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