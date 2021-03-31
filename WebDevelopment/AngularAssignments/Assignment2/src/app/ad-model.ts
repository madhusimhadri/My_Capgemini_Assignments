export interface IAds{
    title:string;
    name:string;
    category:string;
    description:string;
}

export class AdModel {
    constructor(
        public title:string,
        public name:string,
        public category:string,
        public description:string
    ){

    }
}
