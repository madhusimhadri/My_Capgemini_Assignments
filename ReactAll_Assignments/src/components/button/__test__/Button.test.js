import React from 'react'
import ReactDOM from 'react-dom'
import Button from './../Button'
import { render } from '@testing-library/react';
import '@testing-library/jest-dom'
import renderer from 'react-test-renderer'

it("renders without crashing", ()=>{
    const div = document.createElement("div");
    ReactDOM.render(<Button/>,div);
});

it("renders button correctly",()=>{
  const {getByTestId} =  render(<Button label ="click me please"/>);
  expect(getByTestId('button')).toHaveTextContent("click me please");
});

// eslint-disable-next-line jest/no-identical-title
it("renders button correctly",()=>{
    const {getByTestId} =  render(<Button label ="save"/>);
    expect(getByTestId('button')).toHaveTextContent("save");
  });

it("matches snapshot", ()=>{
   const tree =  renderer.create(<Button label ="save"/>).toJSON();
   expect(tree).toMatchSnapshot();
})

// eslint-disable-next-line jest/no-identical-title
it("matches snapshot", ()=>{
    const tree =  renderer.create(<Button label ="click me please"/>).toJSON();
    expect(tree).toMatchSnapshot();
 })