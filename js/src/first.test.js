const R = require('ramda');

describe("First", () => {
    it("should work", () => {
        console.log("OK");
    })
    it("Ramda works", () => {
        const {identity} = R
        const map = R.map(identity, [1, 2, 3]);
        console.log(map);
    });
});

