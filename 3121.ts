function numberOfSpecialChars(word: string): number {
    let ans: number = 0;
        const map: Map<string, number> = new Map();
        for (const c of word) {
            const lCh: string = String.fromCharCode(c.charCodeAt(0) + 32);
            const uCh: string = String.fromCharCode(c.charCodeAt(0) - 32);
            if (c >= 'a' && c <= 'z') {
                if (map.has(uCh)) {
                    map.set(uCh, 0);
                }
                map.set(c, 0);
            } else if (map.has(lCh) && !map.has(c)) {
                map.set(c, 1);
            } else if (!map.has(lCh) && !map.has(c)) {
                map.set(c, 0);
            }
        }

        for (const [k, v] of map) {
            ans += v;
        }

        return ans;
};