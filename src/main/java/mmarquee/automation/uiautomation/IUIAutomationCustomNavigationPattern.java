/*
 * Copyright 2016 inpwtepydjuf@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mmarquee.automation.uiautomation;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

@IID("{01EA217A-1766-47ED-A6CC-ACF492854B1F}")
public interface IUIAutomationCustomNavigationPattern extends Com4jObject {
  // Methods:
  /**
   * @param direction Mandatory mmarquee.automation.uiautomation.NavigateDirection parameter.
   * @return  Returns a value of type mmarquee.automation.uiautomation.IUIAutomationElement
   */

  @VTID(3)
  mmarquee.automation.uiautomation.IUIAutomationElement navigate(
    mmarquee.automation.uiautomation.NavigateDirection direction);


  // Properties:
}
