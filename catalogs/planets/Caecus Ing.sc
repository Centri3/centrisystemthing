Planet	"Ing/Caecus VI"
{
	ParentBody     "Oblitus es"
	Class          "Aquaria"
	Mass            1.32
	Radius          7.09e+03
	InertiaMoment   0.329
	OblatenessInfo  0.00904
	RotationPeriod  2.76e+03
	RotationEpoch   1451545
	Obliquity       68.7
	EqAscendNode    21
	Precession      5e+04

	EndogenousHeating 0
	Albedo          0.94
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Ices		0.03
			Silicates	75
			Metals		25
		}
	}

	Surface
	{
		Preset         "caecus_ing.cfg"
		SurfStyle       0.0516
		Randomize      (0.757, 0.533, -0.826)
		colorDistMagn   0.0418
		colorDistFreq   1.01e+03
		detailScale     128
		drivenDarkening 0
		seaLevel        0.168
		snowLevel       2
		tropicLatitude  0.576
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.969
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.227
		heightTempGrad  0.625
		beachWidth      0.00161
		tropicWidth     0.07
		mainFreq        1.66
		venusFreq       1.3
		venusMagn       1.98
		mareFreq        2.72
		mareDensity     0.275
		terraceProb     0.161
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0387
		dunesFreq       57.3
		dunesFraction   0.509
		hillsMagn       2
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      6.11
		riversFreq      4
		riversSin       5.37
		riftsMagn       0
		riftsFreq       2.25
		riftsSin        5.69
		eqridgeMagn     0.466
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     2.24
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.588
		volcanoMagn     0.321
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0.308
		volcanoRadius   0.214
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.4
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		Period          8099.22947
		SemiMajorAxis   330.433423
		Eccentricity    0.900763359
		Inclination     63.2061069
		AscendingNode   96.1832061
		ArgOfPericenter -123.664122
		MeanAnomaly     8.24427481
	}
}

