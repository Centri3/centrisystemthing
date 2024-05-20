Moon	"Wawa/Lercurnis I III"
{
	ParentBody     "Verna-Luci bar"
	Class          "Aquaria"
	Mass            8.57e-05
	Radius          389
	InertiaMoment   0.397
	Oblateness      0.0275
	OblatenessInfo  0
	RotationPeriod  111
	RotationEpoch   1451545
	Obliquity       8
	EqAscendNode    52.2

	EndogenousHeating 0.0404
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.745 0.538 0.464)

	Surface
	{
		Preset         "lercurnis_verna_wawa.cfg"
		SurfStyle       0.0312
		Randomize      (-0.307, 0.552, 0.607)
		colorDistMagn   0.0497
		colorDistFreq   50
		detailScale     128
		drivenDarkening 0.496
		seaLevel        -0.45
		snowLevel       2
		tropicLatitude  0.756
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.265
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        4.16
		venusFreq       2
		venusMagn       0.649
		mareFreq        0.8
		mareDensity     1
		terraceProb     0.295
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     0
		montesFraction  1
		dunesMagn       0.0418
		dunesFreq       3.45
		dunesFraction   0.283
		hillsMagn       1
		hillsFreq       5
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.41
		riversSin       4.66
		riftsMagn       0
		riftsFreq       2.38
		riftsSin        5.13
		eqridgeMagn     1
		eqridgeWidth    0.0446
		eqridgeModMagn  1.22
		eqridgeModFreq  1.37
		canyonsMagn     0.447
		canyonsFreq     0.123
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.06
		volcanoMagn     0.25
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.313
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20.2
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

	Atmosphere
	{
		Model          "Lercurnis Verna Wawa"
		Height          100
		Density         7.6e-06
		Pressure        1e-06
		Greenhouse      0.0105
		Bright          1
		Opacity         0.1
		SkyLight        0.333
		Hue             0
		Saturation      1

		Composition
		{
			N2        	100
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
		PeriodDays      772.727718
		SemiMajorAxisKm 6010442.08
		Eccentricity    0.00558450592
		Inclination     8
		AscendingNode   52.2137405
		ArgOfPericenter -90.6870229
		MeanAnomaly     97.8867057
	}
}

