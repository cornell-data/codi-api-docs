/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (A JSON of Cornell locations)
   * 
   * @param returnJSON 1 if JSON should be returned
   */
  def locationsCfmGet(returnJSON: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://www.cornell.edu/about/maps", "/locations.cfm", "application/json")
      .withQueryParam("returnJSON", returnJSON)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (A JSON of Cornell locations matching the specified layer)
   * 
   * @param layer Available Layers:  - AllGender  - BigRedBikes  - Bikes  - Blue  - Carshare  - Charging  - FeaturedEvents  - FoodServices  - Lactation  - Parkmobile  - Sustainability  - TCAT  - TodayEvents  - Tour  - Water
   * @param clearCache 1 if cache should be cleared
   */
  def overlayItemsCfmGet(layer: String, clearCache: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://www.cornell.edu/about/maps", "/overlay-items.cfm", "application/json")
      .withQueryParam("layer", layer)
      .withQueryParam("clearCache", clearCache)
      .withSuccessResponse[Unit](200)
      

}
