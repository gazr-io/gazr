const rewire = require("rewire")
const index = rewire("./index")
const hello = index.__get__("hello")
// @ponicode
describe("hello", () => {
    test("0", () => {
        let callFunction = () => {
            hello()
        }
    
        expect(callFunction).not.toThrow()
    })
})
