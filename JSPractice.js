//変数と宣言
const bookTitle = "JavaScript Primer";
const bookPrice = "$29.99",
        bookAuthor = "Oliver";

let bookTitle2;
bookTitle2 = "JavaScript Primer 2";

let count = 0;
count = 1;
count = count +1;

let $;
let _title;
let TITLE;

const TAX_RATE = 0.8;

//値の評価と表示
const total = 100 * TAX_RATE;
console.log(total);

//データ型とリテラル
console.log(typeof bookTitle);
console.log(typeof null);
console.log(typeof true);

true;
false;
console.log(10);
console.log(0b1010);
console.log(0o777);
console.log(0xFF);
;

const time = '9 O\' clock';
console.log(time);

"複数の\n行を\n入力したい";

`複数の
行を
入力したい`;

const name = "Chester";
console.log(`わたしは${name}です`);

const obj = {};
const object = {123: "数字のプロパティ"};
console.log(object[123]);

const arr = [];
const array = [1, 2, 3];
console.log(array[0]);
array.push(4);

//演算子
console.log(10 + 5);

const clubName = ("マンチェスター" + "シティ");
console.log(clubName);

console.log(10 - 5);
console.log(10 * 5);
console.log(10 / 5);
console.log(10 % 3);
console.log(2 ** 3);
console.log(Math.pow(2, 4));

let num = 1;
console.log(num++);
num++;
console.log(num);

let x =1;
console.log(++x);
console.log(x);

const objA = {};
const objB = {};

console.log(objA === objB);

const str = "森森本森";
console.log(str.indexOf("本"));

if(str.indexOf("本") !== -1) {
    console.log("本が見つかりました");
}
if(str.includes("木")) {
    console.log("木が見つかりました");
}

let num = 10;
num += 5;

console.log(true && "Hello, World");
console.log(false && "Hello, World");

const value = 0;
if(value === 0 || value === 1) {
    console.log("正常です");
}

