Planet	"Tectec/Caecus II"
{
	ParentBody     "Oblitus es"
	Class          "Terra"
	Mass            0.10747
	Radius          3201.1
	InertiaMoment   0.32732
	Obliquity       1.1537
	EqAscendNode    3.1035
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.672 0.669 0.665)

	Surface
	{
		Preset         "caecus_tectec.cfg"
		SurfStyle       0.062311
		Randomize      (0.656, 0.066, 0.746)
		colorDistMagn   0.058281
		colorDistFreq   328.42
		detailScale     128
		drivenDarkening 0
		seaLevel        0.099237
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.75683
		icecapHeight    0
		climatePole     1
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45663
		heightTempGrad  0.625
		beachWidth      0.001455
		tropicWidth     0.07
		mainFreq        0.76336
		venusFreq       2
		venusMagn       0.87786
		mareFreq        0.7
		mareDensity     0.44275
		terraceProb     0.21096
		erosion         0
		montesMagn      0.3
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.059574
		dunesFreq       35.155
		dunesFraction   0.74046
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      16.794
		riversFreq      10
		riversSin       6.4133
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     1
		eqridgeWidth    0.052186
		eqridgeModMagn  0.89695
		eqridgeModFreq  3.5115
		canyonsMagn     0.49209
		canyonsFreq     1.1726
		canyonsFraction 0.64813
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.4
		volcanoFreq     1.2672
		volcanoDensity  0.12214
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52672
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.4984
		stripeTwist     0.13774
		cycloneMagn     0.76915
		cycloneDensity  0.31951
		cycloneOctaves  0
		BumpHeight      40
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           0.9904
		SpotBright      2.4957
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          82.548
		Density         0.0051291
		Pressure        0.00064
		Greenhouse      0.013604
		Bright          3
		Opacity         0
		SkyLight        2.1374
		Hue             0
		Saturation      1

		Composition
		{
			Ne        	99.693
			N2        	0.30701
			Ar        	0.00016185
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          6.88422298
		SemiMajorAxis   2.96499407
		Eccentricity    0.05
		Inclination     1.15370897
		AscendingNode   3.10347862
		ArgOfPericenter 167.633588
		MeanAnomaly     96.1832061
	}
}

