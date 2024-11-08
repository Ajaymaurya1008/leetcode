type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    const toBe = (value:any):boolean => {
        if(val===value) return true;
        throw "Not Equal"
    }
    const notToBe = (value:any):boolean => {
        if(val!==value) return true;
        throw "Equal"
    }
    const obj={
        toBe,
        notToBe
    }
    return obj;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */