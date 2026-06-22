//型指定
type Live = {
    id: number;
    date: string;
    artist: string;
    place: string;
    memo: string;
}

//要素取得
const liveForm = document.getElementById("liveForm") as HTMLFormElement;
const liveList = document.getElementById("liveList") as HTMLDivElement;