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

	Surface
	{
		Preset         "caecus_tectec.cfg"
		SurfStyle       0.062311
		Randomize      (0.656, 0.066, 0.746)
		colorDistMagn   0.058281
		colorDistFreq   328.42
		detailScale     128
		drivenDarkening 0
		seaLevel        0.32824
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
		mainFreq        0.72519
		venusFreq       0.38168
		venusMagn       0.26718
		mareFreq        0.8
		mareDensity     0.44275
		terraceProb     0.21096
		erosion         0
		montesMagn      0.17536
		montesFreq      114.08
		montesSpiky     0.83055
		montesFraction  0.86264
		dunesMagn       0.059574
		dunesFreq       35.155
		dunesFraction   0.74046
		hillsMagn       0.1237
		hillsFreq       325.27
		hillsFraction   0.39397
		hills2Fraction  0
		riversMagn      16.794
		riversFreq      10
		riversSin       6.4133
		riftsMagn       14.504
		riftsFreq       9.0076
		riftsSin        5.5416
		eqridgeMagn     0.64885
		eqridgeWidth    0.018178
		eqridgeModMagn  0.9542
		eqridgeModFreq  3.8931
		canyonsMagn     0.49209
		canyonsFreq     1.1726
		canyonsFraction 0.64813
		cracksMagn      0.064185
		cracksFreq      1.4784
		cracksOctaves   0
		craterMagn      0.60628
		craterFreq      6.8111
		craterDensity   1
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.54285
		volcanoFreq     0.92269
		volcanoDensity  0.18219
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.11678
		volcanoRadius   0.45848
		volcanoTemp     193.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.4984
		stripeTwist     0.13774
		cycloneMagn     0.76915
		cycloneDensity  0.31951
		cycloneOctaves  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
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
		Bright          3.6411
		Opacity         0
		SkyLight        1.2137
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
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

