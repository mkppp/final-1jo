import React from 'react';
import styled from 'styled-components';
import Navi from './Navi';

const StyledHeaderDiv = styled.div`
  width: 100%;
  height: 8vh;
  border-bottom: 1px solid #ccc;
  display: flex;
  justify-content: end;
  & div {
      display: flex;
      align-items: center;
      margin-right: 2%;
      & span {
          margin: 10px;
        }
  }
`;
const Header = () => {
    return (
        <StyledHeaderDiv>
            <div>
                <img src='resources/ico_info.svg' />
                <span>관리자 님</span>
            </div>

        </StyledHeaderDiv>
    );
};

export default Header;