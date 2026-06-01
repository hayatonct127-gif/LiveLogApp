//要素を取得
const liveForm = document.getElementById("liveForm");
const liveList = document.getElementById("liveList");

//初期表示
document.addEventListener("DOMContentLoaded", () => {
    displayLives();
    searchLives();
});

//フォーム送信時処理
liveForm.addEventListener("submit", function(e) {
    e.preventDefault();

    //入力値取得
    const date = document.getElementById("date").value;
    const artist = document.getElementById("artist").value;
    const place = document.getElementById("place").value;
    const memo = document.getElementById("memo").value;

    //入力チェック
    if (date === "") {
        alert("日付を入力してください");
        return;
    }else if (artist === "") {
        alert("アーティストを入力してください");
        return;
    }else if (place === "") {
        alert("会場を入力してください");
        return;
    }

    //データ作成
    const liveData = {
        id: Date.now(),
        date: date,
        artist: artist,
        place: place,
        memo: memo
    };

    //ストレージデータ取得
    const lives = JSON.parse(localStorage.getItem("lives")) || [];
    //データ追加
    lives.push(liveData);
    //ストレージ保存
    localStorage.setItem("lives", JSON.stringify(lives));
    //フォームリセット
    liveForm.reset();
    //再表示
    displayLives();
});
//ライブ一覧表示
function displayLives(filteredLives) {
    liveList.innerHTML = "";

    //ストレージデータ取得
    const lives = filteredLives || JSON.parse(localStorage.getItem("lives")) || [];

    //HTML組み立て
    lives.forEach(function(live) {
        const card = document.createElement("div");
        card.className = "live-card";
        card.innerHTML = `
            <div class="live-date">${live.date}</div>
            <div class="live-artist">${live.artist}</div>
            <div class="live-place">${live.place}</div>
            <div class="live-memo">${live.memo}</div>
            <button class="delete-btn" onclick="deleteLive(${live.id})">削除</button>
        `;
        liveList.appendChild(card);
    });
}
//削除ボタン押下時処理
function deleteLive(id) {
    //確認
    if (!confirm("本当に削除しますか？")) {
        return;
    }
    //ストレージデータ取得
    let lives = JSON.parse(localStorage.getItem("lives")) || [];
    //特定idのデータを除外
    lives = lives.filter(live => live.id !== id);
    //ストレージ保存
    localStorage.setItem("lives", JSON.stringify(lives));
    //再表示
    displayLives();
}
//検索機能
function searchLives() {
    const searchInput = document.getElementById("searchInput");

    searchInput.addEventListener("input", (e) => {
        const keyword = e.target.value.toLowerCase();

        //入力時に最新のライブデータを取得
        const lives = JSON.parse(localStorage.getItem("lives")) || [];
        //フィルタリング
        const filteredLives = lives.filter(live => {
            return live.artist.toLowerCase().includes(keyword) ||
                    live.place.toLowerCase().includes(keyword);
        });
        //表示更新
        displayLives(filteredLives);
    } )
}
