function getState(){
    const timezone = Intl.DateTimeFormat().resolvedOptions().timeZone;

if (timezone === "" || !timezone) {
    return null;
}

const state = timezone.split("/")[1].replace("_", " ")

return state
}

export default getState