const SendData= async () => {
    let data = [$("inputEmail").html,
                $("inputName").html,
                $("inputSur").html,
                $("inputCity").html,
                $("inputDOb").html];
    fetch("/Practica5/add", {
        method: "POST",
        body: JSON.stringify(data),
    });
}