function numberOfSpecialChars(word: string): number {
    // const arr: string[] = word.split('');
    // const set: Set<string> = new Set();
    // arr.sort();
    // let ans: number = 0;
    // for (let i = 0; i < arr.length; i++) {
    //     const c: string = arr[i];
    //     const ch: string = String.fromCharCode(c.charCodeAt(0) - 32);
    //     if (set.has(ch) && !set.has(c)) {
    //         ans++;
    //     }
    //     set.add(c);
    // }
    // return ans;

    // another solution
    const a: number[] = new Array(26).fill(0);
    const b: number[] = new Array(26).fill(0);
    
    for (const c of word) {
        if (c >= 'a' && c <= 'z') {
            a[c.charCodeAt(0) - 'a'.charCodeAt(0)]++;
        } else if (c >= 'A' && c <= 'Z') {
            b[c.charCodeAt(0) - 'A'.charCodeAt(0)]++;
        }
    }
    
    let count: number = 0;
    for (let i = 0; i < 26; i++) {
        if (a[i] !== 0 && b[i] !== 0) {
            count++;
        }
    }
    
    return count;

};