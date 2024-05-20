Planet	"Tectec/Caecus II"
{
	ParentBody     "Oblitus es"
	Class          "Terra"
	Mass            0.10747
	Radius          3.2e+03
	InertiaMoment   0.327
	Obliquity       1.15
	EqAscendNode    3.1
	TidalLocked     true

	EndogenousHeating 0.0603
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (1.000 0.996 0.990)

	Interior
	{
		Composition
		{
			Silicates	0.85
			Metals		0.15
		}
	}

	Surface
	{
		Preset         "caecus_tectec.cfg"
		SurfStyle       0.0623
		Randomize      (0.656, 0.066, 0.746)
		colorDistMagn   0.0583
		colorDistFreq   328
		detailScale     128
		drivenDarkening 0
		seaLevel        0.0992
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.757
		icecapHeight    0
		climatePole     1
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.457
		heightTempGrad  0.625
		beachWidth      0.00146
		tropicWidth     0.07
		mainFreq        0.763
		venusFreq       2
		venusMagn       0.878
		mareFreq        0.7
		mareDensity     0.443
		terraceProb     0.211
		erosion         0
		montesMagn      0.3
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0596
		dunesFreq       35.2
		dunesFraction   0.74
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      16.8
		riversFreq      10
		riversSin       6.41
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     1
		eqridgeWidth    0.0522
		eqridgeModMagn  0.897
		eqridgeModFreq  3.51
		canyonsMagn     0.492
		canyonsFreq     1.17
		canyonsFraction 0.648
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.4
		volcanoFreq     1.27
		volcanoDensity  0.122
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.527
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.5
		stripeTwist     0.138
		cycloneMagn     0.769
		cycloneDensity  0.32
		cycloneOctaves  0
		BumpHeight      40
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.399
		RoughnessIce    0.234
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           0.99
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Pluto"
		Height          82.5
		Density         0.00513
		Pressure        0.00064
		Greenhouse      0.0136
		Bright          3
		Opacity         0
		SkyLight        2.14
		Hue             0
		Saturation      1

		Composition
		{
			Ne        	99.7
			N2        	0.307
			Ar        	0.000162
		}
	}

	Climate
	{
		GlobalWindSpeed  0
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

