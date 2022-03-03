const SendData= async () => {
    let iemail = $("#inputEmail").val();
    let iname =$("#inputName").val();
    let isur = $("#inputSur").val();
    let icity = $("#inputCity").val().toUpperCase();
    let idate = $("#inputDob").val();
    let response = fetch("Practica5/add", {
                       method: "POST",
                       headers: {
                           "content-Type": "application/json"
                       },
                       body: JSON.stringify({
                           email: iemail,
                           name : iname,
                           surname : isur,
                           city : icity,
                           date : idate
                       })
                    });
    console.log((await response).status);
    if ((await response).status = 200){
        alert("Datos recibidos con exito");
    }
    else {
        alert("Datos erroneos, por favor mandalo otra vez");
    }

}