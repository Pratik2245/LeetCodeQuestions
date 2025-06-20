function reduce(nums, fn, init) {
    let result = init;
    for (let i = 0; i < nums.length; i++) {
        result = fn(result, nums[i]);
    }
    return result;
}


// Testcase 1
console.log(reduce([1, 2, 3, 4], (a, b) => a + b, 0)); // Output: 10

// Testcase 2
console.log(reduce([1, 2, 3, 4], (a, b) => a + b * b, 100)); // Output: 130

// Testcase 3
console.log(reduce([], (a, b) => 0, 25)); // Output: 25